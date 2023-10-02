# IdentityHub - Centralized Authentication and Authorization Microservice

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
- [Usage](#usage)
   - [User Registration](#user-registration)
   - [User Authentication](#user-authentication)
   - [Token Validation](#token-validation)
- [Configuration](#configuration)
- [Testing](#testing)
- [Documentation](#documentation)
- [Contributing](#contributing)
- [License](#license)

## Introduction

IdentityHub is a centralized authentication and authorization microservice built using Spring Security. It provides secure user authentication and authorization functionality that can be easily integrated into other projects as a central identity provider.

## Features

- User registration with password encryption.
- Token-based authentication using JSON Web Tokens (JWT).
- Role-based authorization controls.
- User data storage using Spring Data JPA.
- Password reset and recovery functionality.
- Scalable and secure authentication and authorization.

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 8 or higher.
- A compatible relational database (e.g., MySQL, PostgreSQL) with the required schema.
- Maven for building the project.

### Installation

1. Clone this repository:

   ```bash
   git clone https://github.com/fr3m3n/IdentityHub
