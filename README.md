# Assignment 2: Factory Method and Abstract Factory Implementation

## Project Overview
This repository contains a Java implementation combining two creational design patterns: **Factory Method** (for handling road and sea transport logistics) and **Abstract Factory** (for creating platform-consistent UI components for Windows and macOS).

## Class Architecture
- **Factory Method Pattern**:
  - **Product**: `Transport` (Interface)
  - **Concrete Products**: `Truck`, `Ship`
  - **Creator**: `Logistics` (Abstract Class)
  - **Concrete Creators**: `RoadLogistics`, `SeaLogistics`
- **Abstract Factory Pattern**:
  - **Abstract Products**: `Button`, `Checkbox` (Interfaces)
  - **Concrete Products**: `WindowsButton`, `MacOSButton`, `WindowsCheckbox`, `MacOSCheckbox`
  - **Abstract Factory**: `GUIFactory` (Interface)
  - **Concrete Factories**: `WindowsFactory`, `MacOSFactory`
- **Client & Entry Point**:
  - **Client**: `DeliveryApplication`
  - **Main / Entry Point**: `Main`

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/Akzhig1t01/Assignment2-Factory-Patterns.git
