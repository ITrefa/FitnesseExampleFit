# FitnesseExampleFit
Simple integer calculator (addition, subtraction, multiplication, division). 

## Get started
To start Fit server use 

```
mvn -Pfitnesse test
```

## Built with 
* [Fitnesse](http://fitnesse.org/FrontPage) - Acceptance tests

## Wiki
```
<test page>
  
!define TEST_SYSTEM {fit}

!|exampleFixture.CalculatorFixture                                  |
|value1|value2|add?|subtract?|multiply?|divide?                     |
|3     |5     |8   |-2       |15       |0                           |
|2     |3     |5   |-1       |6        |0                           |
|6     |3     |9   |3        |18       |2                           |
|5     |2     |7   |3        |10       |2                           |
|0     |0     |0   |0        |0        |ArithmeticException: by zero|
|1     |0     |1   |1        |0        |ArithmeticException: by zero|
```




