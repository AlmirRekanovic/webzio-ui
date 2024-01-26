# Webzio UI Automation

This project contains automated tests for the Webzio website using Selenium and Java.

## Table of Contents

- [Functionality](#functionality)
- [Homepage Links and Navigation](#homepage-links-and-navigation)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Functionality

### Contact Us Page

- Write a test script to auto-fill the form on the [Contact Us page](https://webz.io/tte/contact-us) and submit it.
- Check if an appropriate success message is displayed upon submission.
- Simulate common user mistakes such as leaving a required field empty, or inputting an invalid email or phone number. Confirm that the correct error or warning message is displayed.

### Homepage Links and Navigation

- Write a test script to check if all the links on the navbar work as expected. The script should click each link and verify the URL of the page navigated to.

## Project Structure

The project follows the Page Object Model (POM) design pattern with the following structure:

- **pages:** Contains page classes representing different pages of the website.
- **tests:** Contains test classes for different test scenarios.
- **data:** Includes Lombok classes for data representation.
- **config:** Stores configuration files, e.g., URLs.

## Setup and Installation

1. Clone the repository:

    git clone https://github.com/AlmirRekanovic/webzio-ui.git
    

2. Navigate to the project directory:

    cd webzio-ui
    

3. Ensure you have Java and Maven installed.

4. Download dependencies:

    ```bash
    mvn clean install
    ```

## Running Tests

Run tests using the following command:

```bash
mvn test
