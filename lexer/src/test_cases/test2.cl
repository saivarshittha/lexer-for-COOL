-- In this file ,I have written some special cases dealing with comments

(*
 \\\
 \\
 \''
 \t\n\v\a\r
 1.This is multi line comment ; valid.
*)
"string (* hello *) string"
"string \
(* Heyy *)"
"string (* \
Hii *)"


*)*)*)*)  -- Unmatched comment;Error reported 4 times

-- escaped characters in comments..
(* 
  (* \*) *\) 
  hello \n
  \(* hello (\* hello  *)
hello
*)
hello

(* Nested Comment
	(*
		Hello
	*)
2.multiline comment with EOF ;Error reported as "EOF in comment"