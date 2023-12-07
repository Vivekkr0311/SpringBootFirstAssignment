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
