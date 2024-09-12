# COVID Management Application

## Overview
This project is a Java-based COVID Management Application that helps manage COVID-positive patients by determining their status and providing a list of nearby hospitals. The application uses a MySQL database (hosted locally with XAMPP) and JDBC for database connectivity. It stores patient data, performs COVID status checks, and lists nearby hospitals within a 10 km radius.

## Features
- **Random COVID Test**: Randomly determines if a patient is COVID positive or negative.
- **Nearby Hospital Lookup**: Lists hospitals within a 10 km radius for COVID-positive patients.
- **Patient Record Management**: Stores patient information and test results in the database.
- **JDBC Connection**: Uses JDBC to interact with the MySQL database.

## Database Design

### Tables
1. **patient**
   - Stores patient information and COVID test results.
   - **Columns**:
    
     - `name` (VARCHAR) – Patient name
     - `aadhar_id` (VARCHAR) – Aadhar ID of the patient
     - `latitude` (DECIMAL) – Patient location (latitude)
     - `longitude` (DECIMAL) – Patient location (longitude)
     - `status` (VARCHAR) – 'Positive' or 'Negative'
   
2. **hospital**
   - Stores hospital information.
   - **Columns**:
     - `id` (INT, Primary Key)
     - `name` (VARCHAR) – Hospital name
     - `area_id` (INT, Foreign Key) – Reference to `area.id`
     - `availableBeds` (INT) – Available Beds

3. **area**
   - Stores area information.
   - **Columns**:
     - `id` (INT, Primary Key)
     - `latitude` (DECIMAL) – Hospital latitude
     - `longitude` (DECIMAL) – Hospital longitude

## Installation

### Prerequisites
- **Java JDK** (version 8 or higher)
- **XAMPP** (with Apache and MySQL enabled)
- **MySQL JDBC Driver** (`mysql-connector-java.jar`)

