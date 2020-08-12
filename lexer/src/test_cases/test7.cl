--Some escaped unprintables
STR_CONST "This is a newline:\n"
STR_CONST "This is a backspace:\b"
STR_CONST "This is a formfeed:\f"
STR_CONST "This is a carriage return:\015"
STR_CONST "This is an escape:\033"

--invalid characters
!#%^&_>?`[]\|$

--Some cases to be noted
OBJECTID g
"\001"
"\002"
"\003"
"\004"

-- Some special cases..
"\\-"-"-\-"----\""\\"-"\"\\"-\-"\\"""\--"\""\"
"\\""\"--\""\-\""\"--\\"\"\\"--""\"\--""\"
"\\""\"--\""\\""\"--\\"\"\\""--"\"\""\"--
"\-\""\----"\""\--\""\"\\"\--"\\"""\--"\""\"

"\\""\"\""\\""\"\\"\"\\"""\"\""\"

(*Following has a comment ,string, an error with unmatched close comment ,a string*)
(*"(*"*)"*)"(*"*)"*)(*"  


--"--"--"  --This is comment
"--"--"--  --String + comment
--"--"--"  --Comment

