# Java Workloads Repository

A comprehensive Java learning repository covering core concepts, data structures and algorithms, backend development, and best practices.

## Table of Contents

- [Repository Structure](#repository-structure)
- [Getting Started](#getting-started)
- [Core Java Concepts](#core-java-concepts)
- [Data Structures and Algorithms](#data-structures-and-algorithms)
- [Backend Development](#backend-development)
- [Learning Materials](#learning-materials)
- [File Naming Conventions](#file-naming-conventions)
- [Quick Navigation](#quick-navigation)

## Repository Structure

### Core Java Concepts - [`Core/`](./Core)
Fundamental Java programming concepts organized by topic:

- **[Collections Framework](./Core/CollectionTopic)** - Java Collections Framework
  - [`P1Intro/`](./Core/CollectionTopic/P1Intro) - Introduction to Collections ([guide](./Core/CollectionTopic/P1Intro/guide.md))
  - [`P2CompCmpblPQ/`](./Core/CollectionTopic/P2CompCmpblPQ) - Comparator, Comparable and Priority Queues
  - [`EngDigest/`](./Core/CollectionTopic/EngDigest) - Collections examples and demos

- **[Object-Oriented Programming](./Core/OOPSTopic)** - OOPS concepts and patterns
  - [`AbstractClassesTopic/`](./Core/OOPSTopic/AbstractClassesTopic) - Abstract classes and examples
  - [`InterfaceTopic/`](./Core/OOPSTopic/InterfaceTopic) - Interface concepts and best practices
  - [`InnerClassTopic/`](./Core/OOPSTopic/InnerClassTopic) - Inner class implementations
  - [`StaticFinalTopic/`](./Core/OOPSTopic/StaticFinalTopic) - Static and final keywords

- **[Low Level Design](./Core/LLD)** - Design patterns and examples
- **[Error Handling](./Core/ErrorHandlingTopic)** - Exception handling patterns
- **[Loops and Control Flow](./Core/LoopsTopic)** - Loop concepts and implementations

### Data Structures and Algorithms - [`DSA/`](./DSA)
Comprehensive DSA implementations and problem-solving:

- **[Arrays](./DSA/Arrays)** - Array algorithms and problems
- **[Linked Lists](./DSA/LinkedList)** - Linked list implementations ([notes](./DSA/LinkedList/LL%20Learning%20Notes.md))
- **[Bitwise Operations](./DSA/Bitwise)** - Bit manipulation techniques
- **[Sliding Window](./DSA/SlidingWindow)** - Sliding window pattern problems
- **[Recursion](./DSA/Recursion)** - Recursive algorithms
- **[Pattern Programs](./DSA/Patterns)** - Pattern printing programs
- **[Course Materials](./DSA/Courses/ApnaCol)** - Course-based learning materials
  - [`Strings/`](./DSA/Courses/ApnaCol/Strings) - String manipulation problems
  - [`MultiDimArr/`](./DSA/Courses/ApnaCol/MultiDimArr) - 2D array algorithms

### Backend Development - [`BackendSpring/`](./BackendSpring)
Spring framework and backend development concepts:

- **[Build Systems](./BackendSpring/BuildSystems)** - Build system examples and implementations

### Learning Resources - [`Materials/`](./Materials)
Additional learning materials and references:

- **[Learning Notes and Best Practices](./Materials/adhoc)** - Curated learning resources
  - [`Learnings.md`](./Materials/adhoc/Learnings.md) - Comprehensive Java best practices and tips
  - [`Queries.md`](./Materials/adhoc/Queries.md) - Common Java questions and answers
  - [`New Syntax - Uncommon.md`](./Materials/adhoc/New%20Syntax%20-%20Uncommon.md) - Advanced Java syntax
  - [`Notes.txt`](./Materials/adhoc/Notes.txt) - Quick reference notes

- **[Code Snippets](./Materials/Snippets)** - Reusable code snippets and utilities

## Getting Started

1. **Browse by Topic**: Navigate to specific directories based on your learning goals
2. **Start with Core**: Begin with [`Core/`](./Core) for fundamental Java concepts
3. **Practice DSA**: Move to [`DSA/`](./DSA) for algorithm practice
4. **Read Learning Materials**: Check [`Materials/adhoc/Learnings.md`](./Materials/adhoc/Learnings.md) for best practices
5. **Follow Guides**: Look for `guide.md` files in topic directories for detailed explanations

## Core Java Concepts

**Essential Topics to Master:**
- [Collections Framework](./Core/CollectionTopic) - Lists, Sets, Maps, and Queues
- [OOP Principles](./Core/OOPSTopic) - Inheritance, Polymorphism, Encapsulation
- [Error Handling](./Core/ErrorHandlingTopic) - Exception management patterns
- [Low Level Design](./Core/LLD) - Design patterns and architecture

## Data Structures and Algorithms

**Popular Problem Categories:**
- [Array Algorithms](./DSA/Arrays) - Searching, sorting, and manipulation
- [String Processing](./DSA/Courses/ApnaCol/Strings) - Pattern matching and transformations
- [Sliding Window](./DSA/SlidingWindow) - Efficient subarray processing
- [Matrix Operations](./DSA/Courses/ApnaCol/MultiDimArr) - 2D array algorithms

## Backend Development

**Spring Framework Focus:**
- [Build Systems](./BackendSpring/BuildSystems) - Project structure and compilation

## Learning Materials

**Key Resources:**
- [**Java Best Practices**](./Materials/adhoc/Learnings.md) - Comprehensive guide with tips and tricks
- [**Common Q&A**](./Materials/adhoc/Queries.md) - Frequently asked Java questions
- [**Advanced Syntax**](./Materials/adhoc/New%20Syntax%20-%20Uncommon.md) - Uncommon but useful Java features
- [**Quick Notes**](./Materials/adhoc/Notes.txt) - Reference materials and external links

## File Naming Conventions

### Parts Organization
- **P1Intro, P2CompCmpblPQ** - Files with "P" prefix indicate sequential parts (P`<Number><Name>`)
  - Example: `P1Intro` = Part 1: Introduction
  - Example: `P2CompCmpblPQ` = Part 2: Comparator, Comparable and Priority Queue

### Basic Examples
- **B_ObjSortDemo** - Files with "B_" prefix indicate basic examples (B_`<Name>`)
  - Example: `B_ObjSortDemo` = Basic Object Sorting Demonstration

### Directory Patterns
- **Topic-based**: `<Concept>Topic/` (e.g., `CollectionTopic/`, `OOPSTopic/`)
- **Course-based**: `Courses/<CourseName>/` (e.g., `Courses/ApnaCol/`)
- **Implementation**: `<Feature>/<Implementation>/` for organized code structure

## Quick Navigation

| Learning Path | Starting Point | Key Files |
|---------------|----------------|-----------|
| **Java Fundamentals** | [`Core/`](./Core) | [`CollectionTopic/P1Intro/guide.md`](./Core/CollectionTopic/P1Intro/guide.md) |
| **Problem Solving** | [`DSA/`](./DSA) | [`Arrays/`](./DSA/Arrays), [`SlidingWindow/`](./DSA/SlidingWindow) |
| **Best Practices** | [`Materials/adhoc/`](./Materials/adhoc) | [`Learnings.md`](./Materials/adhoc/Learnings.md) |
| **Course Content** | [`DSA/Courses/ApnaCol/`](./DSA/Courses/ApnaCol) | [`Strings/`](./DSA/Courses/ApnaCol/Strings), [`MultiDimArr/`](./DSA/Courses/ApnaCol/MultiDimArr) |
| **Backend Development** | [`BackendSpring/`](./BackendSpring) | [`BuildSystems/`](./BackendSpring/BuildSystems) |

---

**Pro Tip**: Start with the [Learning Materials](./Materials/adhoc/Learnings.md) to understand Java best practices, then explore topic-specific directories based on your interests!