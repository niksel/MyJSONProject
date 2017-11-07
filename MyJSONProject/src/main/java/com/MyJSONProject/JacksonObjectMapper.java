package com.MyJSONProject;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JacksonObjectMapper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 serialize();
    	deserialize();
	}
	
	private static void serialize() throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        //convert Object to json string
        Customer customer = createCustomer();
        
        //configure Object mapper for pretty print
        objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);
         
        //writing to console, can write to any output stream such as file
        objectMapper.writeValue(System.out, customer);
        
        objectMapper.writeValue(new PrintWriter("c:\\NikhilDocs\\output.json"),customer);
	}

	public static void deserialize() throws IOException {
         
        //read json file data to String
        byte[] jsonData = Files.readAllBytes(Paths.get("c:\\NikhilDocs\\output.json"));
         
        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();
         
        //convert json string to object
        Customer customer = objectMapper.readValue(jsonData, Customer.class);
         
        System.out.println("Customer Object\n"+customer.toString());
    }
	
	private static Customer createCustomer() {
        Customer customer = new Customer();
        customer.setCustomerId(100);
        customer.setName("Nikhil");
        customer.setDateOfBirth(new Date());
        customer.setAnnualSalary(60000);
        List<Address> addresses = new ArrayList<Address>();
        Address a1 = new Address();
        a1.setStreet("Heath Street");
        a1.setCity("Buffalo");
        a1.setState("NY");
        a1.setCountry("US");
        a1.setZipcode("14214");
        addresses.add(a1);
        Address a2 = new Address();
        a2.setStreet("MCKiney Street");
        a2.setCity("NYC");
        a2.setState("NY");
        a2.setCountry("US");
        a2.setZipcode("14224");
        addresses.add(a2);
        customer.setAddresses(addresses);
        List<PaymentMethod> methods = new ArrayList<PaymentMethod>();
        PaymentMethod pm1 = new PaymentMethod();
        pm1.setCardNo(101);
        pm1.setDateFrom(new Date());
        pm1.setCardType(CardType.CREDITCARD);
        pm1.setCardName("Discover");
        PaymentMethod pm2 = new PaymentMethod();
        pm2.setCardNo(102);
        pm2.setDateFrom(new Date());
        pm2.setCardType(CardType.DEBITCARD);
        pm2.setCardName("MasterCard");
        methods.add(pm1);
        methods.add(pm2);
        customer.setPaymentMethods(methods);
       return customer;
    }



}
