import javax.swing.JOptionPane;

public class authentication_module {
	
	public static final int LIMIT = 3;

	public static void main(String[] args)
	{
		int trial = 0;
		
		String corUser = "atretyak";
		String corPW = "frank";
		String username;
		String password;
		String acctType;
		
		String acctInpt =
				JOptionPane.showInputDialog("Enter account type: ");
		acctType = (acctInpt);
		
		String uInput =
				JOptionPane.showInputDialog("Enter username: ");
		username = (uInput);
	
		if (trial < LIMIT)
		{
			if (!(username.equals(corUser)) && (trial < LIMIT))
			{
				trial++;
				uInput =
						JOptionPane.showInputDialog("The username is incorrect. "
								+ "Try again.");
				username = (uInput);	
			}
			
			String pInput =
					JOptionPane.showInputDialog("Enter password: ");
			password = (pInput);
			
			if (!(password.equals(corPW)) && (trial < LIMIT))
			{
				trial++;
				pInput =
						JOptionPane.showInputDialog("The password is "
								+ "incorrect. Try again.");
				password = (pInput);
			}
			if ((password.equals(corPW)) && (username.equals(corUser)))
			{
				JOptionPane.showMessageDialog(null, "Welcome atretyak.");
				
				String[] choices = { "Admin", "Student", "Staff"};
				String input = (String) JOptionPane.showInputDialog(null, 
						"Choose account type...","Account Type",
						JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
				System.out.println(input);
				
				if (!(acctType.equalsIgnoreCase(input)))
				{
					JOptionPane.showMessageDialog(null, "Invalid account "
							+ "type. Relaunch app and select correctly.");	
				}
					

				switch (input)  
				{
				case "Admin": 
					System.out.println("Welcome Admin! You can update "
							+ "and read file."); 
					break;
				case "Student":
					System.out.println("Welcome Student! You can "
							+ "only read file."); 
					break; 
				case "Staff":
				System.out.println("Welcome Staff! You can update, read, add, "
						+ "delete file."); 
					break;				 
				default:
				System.out.println("Invalid account type.");
				break; 
				}
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Contact admin.");
				System.exit(0);
			}
		}	
	}
}
