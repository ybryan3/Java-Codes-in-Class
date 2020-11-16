# Java-Codes-in-Class
BMI Tester:
- Given input from user via Scanner, ouputs BMI.
- Accounts for 4 metrics: kilogram, meter, pound, and inch
- Repeats 10 tests

EndLessDiceGame:
PROGRAMMING STRATEGY
ⓐGame begins
ⓑHuman goes first, throws dice 
- if dice gives [1], directs to computer's turn. 
- If dice gives [2~6], directs to user input for decision making
ⓒcomputer's turn 
- if dice gives [1], directs to user's turn. 
- if dice gives [2~6], directs to continuous loop until that turn's score reaches more or equal to 20 
ⓓDice [1] also causes that turn's score to 0.
ⓔInput mismatch catch for Scanner

QuadFuncCal:
Quadratic Function Calculator given variables a, b, and c.
Ex) x^2 + 3x+ 2 = 0 → a = 1, b = 3, c = 2

 x=  (-b ± sqrt(b^2 - 4ac)) / (2a)

SalaryCal:
Takes string and double inputs using Scanner and outputs one of the three
1) The base salary you entered does not comply with the state law
2) The number of hours your entered does not comply with company policy
3) The total pay for <%s> is <%.2f> dollars", fullName, answer
- Assumed overtime work hours is determined by "hoursworked" minus 40


