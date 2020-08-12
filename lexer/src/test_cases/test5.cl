-- With Correct cool program

class Main inherits IO{

	-- subroutine to calculate modulus
	mod(a:Int,b:Int):Int{ 
		a-(a/b)*b
	};
	--subroutine to calculate exponent
	pow(a:Int,b:Int):Int{ 
	 let exp : Int in{
	 	exp<-1;
		while(not(b=0))loop{
			exp <- exp*a;
			b <- b-1;
			}pool;
			exp;
		}	
	};
	--method that converts binary to decimal
	bin2deci(a:Int):Int{
		let deci :Int , i:Int,rem :Int in{
			deci <- 0; 
			i <- 0;
			while(not(a=0))loop{
				rem <- mod(a,10);
				a <- a/10;
				deci <- deci + rem * pow(2,i);
				i <- i+1;
			}pool;
			deci;
		}
	};
	main():Object{
		 
		
		let x:Int in{
 		out_string("Enter the number :");--Enter a number with less than 9 digits
 		x <- in_int();
 		out_int(self.bin2deci(x));
 		out_string("\n");
		 }
		
	};
};
