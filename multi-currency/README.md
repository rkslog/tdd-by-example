# Multi-Currency Money

Single Currency Report:

|Instrument|Shares|Price|Total|
|---|---|---|---|
|IBM|1000|25|25000|
|GE|400|100|40000|

Multi Currency Report:

|Instrument|Shares|Price|Total|
|---|---|---|---|
|IBM|1000|25 USD|25000 USD|
|GE|400|150CHF|60000 CHF|
| | |Total|65000 USD|

Exchange rate:

|From|To|Rate|
|---|---|---|
|CHF|USD|1.5|

## Functional Requirements

- ~~$5 * 2 = 10 USD~~
- $5 + 10 CHF = $10 if rate is 2:1
- ~~equals()~~
- ~~hashcode()~~
- equal null
- equal object
- ~~use records~~


## Learning
- Removing duplication helps removing dependencies between code.
- Use _real implementation_ if it is simple. Otherwise, _fake it_ by returning constants and use refactoring to solve
  the problem
- Triangulation:
  - translate a design objection( side effects) into a test case that failed because of the objection.
  - Get the code to quickly compile with stub implementations, then refactor design.
  - Ensure to have both true and false assertions in the test
    
- Value Objects: 
  - Prefer to use value objects because you don't have to worry about aliasing problems.Value objects have
  constraints that the values of the instance variables never change once they have been set in the constructor.
  - Another constraint on value objects is that they should implement `equals()`
  - With java 16, we may use records to create value objects. With older version of java, all operations on the object
  must return a new object.