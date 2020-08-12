

# **COOL Compiler**

## _Lexical Analyzer using ANTLR4_

**NAME**     : SAI VARSHITTHA PONNAM
**ROLL NO**:CS18BTECH11035

**FILES SUBMITTTED:**
 1.test1.cl -This file consists of cases to check the working of lexer rules for comments .
 2.test2.cl -In this file ,I have written some special cases dealing with comments
 3.test3.cl -In this file ,we check the validity of int and string constants.
 4.test4.cl -In this file ,we check the special errors in string constants.
 5.test5.cl -consists of one correct cool program.
 6.test6.cl -checking for correct tokenising of identifiers,numbers and Keywords.
 7.test7.cl -checking for some complicated series of characters.




***Note :*** The testacases are written so as to ensure correct tokenisation as well as to check if all the possible errors are reported properly.


--------------------------------------------------------
## Structure :
The lexer for *COOL* programming language is implemented using ANTLR4.
Following is the order for tokenisation :
1. **_Operators_**
2. **_Keywords_**
3. **_Identifiers_**
4. **_Strings & WhiteSpaces_**
5. **_Comments , Not valid Characters_**

##### **Note :** All errors are handled except the line numbers.
-----------------------------------------------------

## Design Rules :
---------------------------------------------------
### **_Design Rules for Strings & Whitespaces_**
 Strings are enclosed with in double quotes . In a string following characters are treated differently(whitespaces):


 - \b -> backspace
 - \n -> newline
 - \t -> tabspace
 - \f ->formfeed
 - '  '(blank space) & \v also provide white space but \v is not recognised by ANTLR , so we used UTF-8 encoding style to represent it so we can skip the input if we encounter any of the above special characters.
***There are three possibilities for a string :***
 - Either it is terminated string : for which the string be tokenised as STR_CONST.
 - Unterminated string  : Error must be reported
 - EOF is encountered within a string  : Error must be reported.
 So, for tokenising strings , I've seperately written regular expressions for above three cases . If either of three conditions is satisfied , then the processString function is invoked.

 - The process string function processes the string & reports suitable error if any.
 **Description of Process String Function:**

 - The string is processed in this function . Apart from that ,errors within them are also reported.
 - If the length of string is greater than 1024 , error is reported .
 - The error that is first recognised is reported . However , in COOL language the following are observed : (So I implemented accordingly..)
    1. If there are 1024/1025 characters and NULL character is present at the end of the string , the error is reported as **string contains null character.**
    2. If there are 1024 characters and last character is unescaped newline , then the error is reported as **unterminated string constant.**
    3. In order to report the above errors , suitable flags are used in the code and are self explanatory.
 - If unescaped newline is encountered , the error is reported as **unterminated string constant.**
 - When null character or escaped null character are found within string , error is reported as **null character present in the string and escaped null charcter present in the string respectively.**
 - If  backslash is present before end of file , as per the COOL compiler , the error is reported same as like **backslash at end of file.**
 - If double quotes are present inside the string , they are reported as such .(meaning that there might be a case where double quotes are a part of the string).
 - Whenever an error is encountered  inside a string , further lexing of the same string is halted and the lexing resumes in the next occuring code part.
 - Care is taken when a **\\** (backslash) is encountered inside a string . The possible cases are written with switch case statements .
 -   In a string , special escaped characters like \n are taken as one character.
 - All possible errors are handled inside the process function.



------------------------------------------------
### **_Design Rules for Comments_**
In COOL , there are two types of comments viz., Line comments , Block comments.
**Line comments :**
When a  '**-** **-**' is encountered , then it means that it is a line comment . Anything after than '**-** **-**' is skipped by the lexer.
EOF at the end of this type of comment is considered fine.
**Block comments :**
Encountering a **(*** refers to the start of a block comment. Since these can be nested , I have used two modes to deal with them.

 - An error is reported when **(*** is followed by EOF and that error is tokenised as ERROR1.
 - If " \*) " is encountered first ( whether or not followed by EOF), then the error is reported as Unmatched \*).
 - Otherwise, mode INCOMMENT is invoked . Incase of nested comments , mode NESTEDCOM will be invoked from INCOMMENT.
 - In the INCOMMENT mode :
    1. If EOF is encountered right after **(\*** , error is reported and is tokenised as ERROR2.
    2. If EOF is encountered anywhere inside the comment before the closing of the comment ; an error is reported and is tokenised as ERR.
    3. NESTEDCOM mode is invoked whenever **(\*** is encountered.
    4. Modes are popped upon encountering **\*)**.

 - NESTEDCOM mode design is similar to INCOMMENT mode except that NESTEDCOM invokes NESTEDCOM mode upon encountering further nested comments.
 ----------------------------------------------------------------------------------------
 ### **_Design Rules for Keywords_**
 We must place keywords rules above identifier rules. Otherwise , keywords will be tokenised as identifiers.(Since the first matching rule is used.)
 Keywords are case insensitive except incase of boolen constants where the fisrt letter must be lower letter but remaining are case insensitive.
 So we write rules as  :

```CLASS : ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');```
```TRUE  : 't'('r'|'R')('u'|'U')('e'|'E');```
```FALSE : 'f'('a'|'A')('l'|'L')('s'|'S')('e'|'E');```  

 ----------------------------------------------------------
  ### **_Design Rules for Identifiers_**
 The type identifiers start with uppercase lletter while object identifiers start with lower case letters. So we write the rules as follows :
```fragment  LLETTER:[a-z];```
```fragment  ULETTER:[A-Z];```
```fragment  LETTER:(LLETTER|ULETTER);```
```TYPEID : ULETTER(LETTER|DIGIT|'_')*; ```
```OBJECTID : LLETTER(LETTER|DIGIT|'_')* ;```

----------------------------------------------------------


  ### **_Design Rules for operators:_**
  Rules are written as ,
  ```DOT : '.' ;```
```DARROW : '=>';```

 --------------------------------------------------------
 **If an input doesnot match with any of the rules , an error message is generated.**
 ----------------------------------------------------------
## Testing
Testing is done with many examples and some testcases are attached .
