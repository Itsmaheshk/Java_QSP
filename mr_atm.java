class mr_atm 
{
	public static void main(String[] args) 
	{

// PreCondition_Data
      int pin=2299;
	  int sav_bal=1000;
	  int fix_bal=1500;
	  int curr_bal=2000;
	  

// Welcome & Navigation Statements

		System.out.println("Welcome To the Bank Of Maharashtra!"); //how to put timer in JAVA?
		System.out.println();
		System.out.println("Insert your Card...");
		System.out.println();
		System.out.println("Choose Options Below");
		System.out.println();
		System.out.println(" 1.Withdraw Cash \n 2.Check Balance \n 3. Change PIN \n 4.Deposite Money");

//SWITCH_1
        int a=5; //User_input
        switch(a)
		{
         case 1: 
			{
			 System.out.println("Choose bank account type");
             System.out.println(" 1.Saving Account \n 2. Current Account \n 3.Fixed Account");
			 int b=3; //User_input
//switch_1.1
			 switch(b)
				{
                 case 1: 
			           {
			             System.out.println("enter amount to withdraw");
						 int with_ammount=1000; //user input 

						 if(with_ammount<=sav_bal)
						   {
							 System.out.println("Enter your PIN");
							 int ent_pin=2299; //user input

                               if(ent_pin==pin)
							    {
                                System.out.println("Please Wait while your Transaction is being proceed...");
                                sav_bal=sav_bal-with_ammount; //withdraw_operation
								System.out.println("Collect Your Cash");
								System.out.println(" Accont Balance is  " + sav_bal);
							    }
							   else
							    {
								   System.out.println("Entered PIN is wrong");
                                }

						   }
						   else
						   {
							   System.out.println("Insufficient Account Balance");
						   }

			           }
		               break;

			     case 2: 
			           {
			             System.out.println();
						 System.out.println("enter amount to withdraw");
						 int with_ammount=1000; //user input 
						 if(with_ammount<=curr_bal)
						   {
							 System.out.println("Enter your PIN");
							 int ent_pin=2299; //user input
                             if(ent_pin==pin)
							   {
                                System.out.println("Please Wait while your Transaction is being proceed...");
                                curr_bal=curr_bal-with_ammount;
								System.out.println("Collect Your Cash");
								System.out.println(" Accont Balance is  " + curr_bal);
							   }
							   else
							   {
								   System.out.println("Entered PIN is wrong");
                               }

						   }
						   else
						   {
							   System.out.println("Insufficient Account Balance");
						   }
			           }
		               break;

				 case 3: 
			           {
			             System.out.println();
						 System.out.println("enter amount to withdraw");
						 int with_ammount=1000; //user input
						 
						 if(with_ammount<=fix_bal)
						   {
							 System.out.println("Enter your PIN");
							 int ent_pin=2299; //user input

                             if(ent_pin==pin)
							   {
                                System.out.println("Please Wait while your Transaction is being proceed...");
                                fix_bal=fix_bal-with_ammount;
								System.out.println("Collect Your Cash");
								System.out.println(" Accont Balance is  " + fix_bal);
							   }
							   else
							   {
								   System.out.println("Entered PIN is wrong");
                               }

						   }
						   else
						   {
							   System.out.println("Insufficient Account Balance");
						   }
			           }
		               break;

				}
              }
		 break;

		 case 2: 
			{
			 System.out.println("check balance");
			}
		 break;


		case 3: 
			{
			 System.out.println("Pin change");
			}
		 break;


		case 4: 
			{
			 System.out.println("Deposite Money");
			}
		 break;

        default:System.out.println("You have entered wrong choice");

        }

			
		
	}
}
