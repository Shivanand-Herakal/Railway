package com.project.railway.service;

import java.io.IOException;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.railway.dto.Customer;
import com.project.railway.helper.ResponseStructure;

import freemarker.template.MalformedTemplateNameException;
import freemarker.template.TemplateException;
import freemarker.template.TemplateNotFoundException;
import jakarta.mail.internet.ParseException;


public interface Customer_Service  {

	ResponseEntity<ResponseStructure<Customer>> signup(Customer customer, MultipartFile pic) throws IOException, ParseException, TemplateException, Exception;

	ResponseEntity<ResponseStructure<Customer>> login(String email, String password) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException;

	ResponseEntity<ResponseStructure<Customer>> verifyotp(String email, int otp);

	ResponseEntity<ResponseStructure<Customer>> resendOtp(String email) throws Throwable;

}
