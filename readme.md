it is a console application.



PSEUDOCODE:
Class main
	In main function 
		Total number of students attending the test is taken as input
		While loop runs for n number of students
			The time student started the test is taken
			A function find_ans is called from class called questions
			The time student has completed the test is taken
			Difference between them is calculated
			Function each_student is called from student class
		Function calculate is called from difficulty class

Class questions
	In find_ans method
		The question is printed with options
		The answer given by the student is taken as input
		Checking the answer is correct or wrong
		If it is correct the correct count is increased
		This is repeated for all the questions
		This function will return the no of questions correctly answered by the student
Class student
	In each_student method
		The total question and no of correct answer by student is given to the function	
		The number of questions wrongly answered by the student is calculated
		Prints the total number of questions correctly answered and wrongly answered and time taken by the student
		This method runs each time when a student takes test

Class difficulty
	In calculate function
		The difficulty of question is calculated
		If number of times question is answered correct is less than the half of total number of students attended it is printed as difficult question
		If number of times question is answered correct is greater than the 75 percent of total number of students attended it is printed as easy question
		Else  it is printed as Medium question





Explanation:
	The program will calculate 
*Total number of students who have attended this question
* Time taken by each student to answer this question
* Total number of students who have answered it right
* Total number of students who have answered it wrong
