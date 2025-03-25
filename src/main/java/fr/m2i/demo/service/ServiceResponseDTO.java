package fr.m2i.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceResponseDTO<T> {
    public String code;
    public String message;
    public T data;

    public static <T>ServiceResponseDTO<T> performResponse(ServiceResponseDTO<T> response) {
        Logger logger = LoggerFactory.getLogger(BankService.class);

        logger.info(String.format("code : %s , message : %s ", response.code, response.message));
        return response;
    }

    public static <T>ServiceResponseDTO<T> buildResponse(String message, String code, T data) {
        ServiceResponseDTO<T> response = new ServiceResponseDTO<T>();
        response.code = code;
        response.message = message;
        response.data = data;
        return performResponse(response);

    }

    public static <T>ServiceResponseDTO<T> buildResponse(String message, String code) {

        return buildResponse(message, code, null);

    }
}
