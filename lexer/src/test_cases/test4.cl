--In this file ,we check the special errors in string constants.
"Hello
world
" 

"Not escaping this newline
"

"This is also not escaped \\
"

"This is, escaped though \\\
"

"\\"

"It's fine to have this: \n  in a string"

"no error for\
multiple escaped\
newlines\
"
--no errror in this,will be tokenised as String constant.
"hello\"world!"

--no error
"mutiple\
escaped\
newlines\
"

-- error unterminated string
"hello\
multiple\
error\\
lines\
"
-- error unterminated string
"multiple
unescaped
newlines"

-- no error
"multiple\\\\\
finebackslash\\\\\\\
lines"

-- error unterminated string 
"multiple\\\
errorbackslash\\\\\\\\\\\
lines\\\\
"

-- error contains null char 
"This string has\
multiple escaped\
newlines   and string\
containing null\
character"

-- error contains null char 
"this string ends\
with an  unescaped\
newline and has\
null 
characters"


"multiple\
escaped\
newlines12\\\
\"\
"
"hello\\\\\\\\\\\
world\\\\\
\"
--error unterminated string


"not a valid string\"  -- unterminated
"This string contains an escaped null character. Reports error\ "

"This string has backslash error at the end ; reported as backslash error\