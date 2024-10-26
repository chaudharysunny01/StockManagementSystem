
# Stock Management System

A simple command-line application to manage stock items. This application allows users to add, remove, update, and view stock levels of items in a store or warehouse.

## Features

- **Add Stock Item**: Add a new item with an initial quantity.
- **Remove Stock Item**: Remove an item from the stock by its name.
- **Update Stock Quantity**: Update the quantity of an existing stock item.
- **View Stock Levels**: Display the current stock levels of all items.
- **Exit**: Close the application.

## Getting Started

### Prerequisites

- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) or higher installed

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/stock-management-system.git
   cd stock-management-system
   ```

2. Compile the Java code:
   ```bash
   javac StockManagementSystem.java
   ```

3. Run the application:
   ```bash
   java StockManagementSystem
   ```

## Usage

1. **Add Stock Item**: Choose option `1` and follow the prompts to add a new item by specifying its name and initial quantity.
2. **Remove Stock Item**: Choose option `2` and enter the name of the item you want to remove.
3. **Update Stock Quantity**: Choose option `3` and enter the item's name along with the new quantity.
4. **View Stock Levels**: Choose option `4` to display all items and their quantities.
5. **Exit**: Choose option `5` to exit the application.

## Example

```plaintext
Stock Management System
1. Add Stock Item
2. Remove Stock Item
3. Update Stock Quantity
4. View Stock Levels
5. Exit
Enter your choice: 1
Enter stock item name: Apples
Enter initial quantity: 100
Stock item added successfully!
```

## Code Structure

- `StockManagementSystem`: Main class that handles user interaction and manages stock operations.
- `StockItem`: Represents an individual stock item with a name and quantity.
