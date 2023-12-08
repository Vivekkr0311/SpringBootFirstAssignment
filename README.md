# SpringBootFirstAssignment
## Customer API Documentation 📋

This document provides instructions on how to interact with the Customer API.

## Base URL

Replace `localhost:9090` with the base URL where your Spring Boot application is running. 🌐

## ✨ Create a Customer (POST)

### Request

```
POST /customers

{
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "phoneNumber": "1234567890"
}
```

### Response

```
🎉 **201 OK**
```

## 🕵️‍♂️ Get a Customer by ID (GET)

### Request

```
GET /customers/{customer_id}
```

### Response

```json
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "phoneNumber": "1234567890",
    "email": "john.doe@example.com",
    "billing_address": "Street 123",
    "delivery_address": "Street 123"
}
```

```
🎉 **200 OK**
```

## 🔄 Update a Customer by ID (PUT)

### Request

```
PUT /customers/{customer_id}
```

#### Input body with update values

```json
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "phoneNumber": "1234567890",
    "email": "john.doe@example.com",
    "billing_address": "New address",
    "delivery_address": "New address"
}
```

### Response

```
🎉 **200 OK**
```

## ❌ Delete a Customer by ID (DELETE)

### Request

```
DELETE /customers/{customer_id}
```

### Response

```
🎉 **204 OK**
```

# 🚀 Spring Boot Customer API

This API provides information about customers and supports content negotiation for responses in both JSON and XML formats.

## 🌐 Base URL

Replace \`localhost:9090\` with the base URL where your Spring Boot application is running.

## 🕵️‍♂️ Get a Customer by ID

### 🚀 Request for JSON

```http
GET /customers/1
Accept: application/json
```

### 🌟 Response for JSON

```json
{
    "id": 1,
    "firstName": "John",
    "lastName": "Doe",
    "phoneNumber": "1234567890",
    "email": "john.doe@example.com",
    "billing_address": "Street 123",
    "delivery_address": "Street 123"
}
```

### 🚀 Request for XML

```http
GET /customers/1
Accept: application/xml
```

### 🌟 Response for XML

```xml
<Customer>
    <id>1</id>
    <firstName>John</firstName>
    <lastName>Doe</lastName>
    <phoneNumber>1234567890</phoneNumber>
    <email>john.doe@example.com</email>
    <billing_address>Street 123</billing_address>
    <delivery_address>Street 123</delivery_address>
</Customer>
```

Adjust the URLs and headers based on your specific implementation. This documentation shows how to request data in both JSON and XML formats using the \`Accept\` header.

# Product API Documentation 📋

This document provides instructions on how to interact with the Product API.

## Base URL

Replace `localhost:9090` with the base URL where your Spring Boot application is running. 🌐

## 📦 Get All Products (GET)

### Request

```
GET /products
```

### Response
```json
[
    {
        "skuID": 1,
        "label": "Product ABC",
        "productDescription": "A high-quality product with advanced features.",
        "stock": 100,
        "leadtime": 7
    },
    // ... (other product entries)
]
```

Status Code: 200 OK

## ✨ Create a Product (POST)

### Request

```
POST /products
Request Body:

{
    "label": "New Product",
    "productDescription": "Description of the new product.",
    "stock": 50,
    "leadtime": 10
}
```

### Response

Status Code: 201 Created

```json
{
    "skuID": 2,
    "label": "New Product",
    "productDescription": "Description of the new product.",
    "stock": 50,
    "leadtime": 10
}
```



