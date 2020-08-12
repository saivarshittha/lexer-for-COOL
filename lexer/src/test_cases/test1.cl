-- This file consists of cases to check the working of lexer rules for comments .

--1.Single line comment ,no error


(*
 2.
 This is a multi-line commment ; no error
*)

*) -- 3.Unmatched case ; error reported

*)*)*)*) --4.Unmatched case ; error reported 4 times

(*This is invalid comment *)*) --5.Error reported since unmatched brackets involved.

--"This is not a string ; but a comment." 6.

(*"
\\
\\\\
7.No error reported,this case is ok ; multi line comment.
"
*)

" 8.Hello, --I am not a comment;but part of a string." 
{
    --I am a comment
    "(* 9. I am not a comment but part of the string*)"
}



--10. This is single line comment with EOF ; It is valid