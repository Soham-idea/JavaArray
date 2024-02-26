package RestrauntManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();

		CustomerLogin cl = new CustomerLogin();
		ManagerLogin ml = new ManagerLogin();
		ProductDetails pd = new ProductDetails();

		do {
			System.out.println("1.Welcome");
			System.out.println("Enter the Choice");
			int choice = sc.nextInt();

			switch (choice) {

			case 1:

				do {

					System.out.println("1.login");
					System.out.println("2.Register");
					System.out.println("Enter the Choice");

					int ch = sc.nextInt();

					switch (ch) {
					case 1:
						do {
							System.out.println("1.Login for manager");
							System.out.println("2.Login for Customer");

							int ccc = sc.nextInt();
							switch (ccc) {
							case 1: {

								System.out.print("Set userId,Set UserPassword:");
								int un1 = sc.nextInt();
								String pass1 = sc.next();
								ml.setUser_id(un1);
								ml.setUser_password(pass1);
								;

								if (al.add(ml)) {
									System.out.println("Add Successfully....");

									System.out.print("verify userId, UserPassword:");
									int u1 = sc.nextInt();
									String p1 = sc.next();
									boolean c = false;

									for (int i = 0; i < al.size(); i++) {
										ManagerLogin ml1 = (ManagerLogin) al.get(i);
										if (ml1.getUser_id() == u1 && ml1.getUser_password().equals(p1)) {
											c = true;
											break;
										}
									}
									if (c) {
										System.out.println("Login Sucessfully");

										do {

											System.out.println("1.Add food Product");
											System.out.println("2.Display product");
											System.out.println("3.delete Product");
											System.out.println("Enter the Choice");

											int cw = sc.nextInt();
											switch (cw) {

											case 1:

												System.out.println("Enter Product Name ID PRICE");
												String PName = sc.next();
												int pid = sc.nextInt();
												int pprice = sc.nextInt();
												pd.setProduct_name(PName);
												pd.setProduct_id(pid);
												pd.setProduct_price(pprice);
												if (al1.add(pd)) {
													System.out.println("Product Added Successfully");
												} else {
													System.out.println("some thing Went Wrong");
												}

												break;
											case 2:
												for (Object obj : al1) {
													ProductDetails pd1 = (ProductDetails) obj;
													System.out.println(pd1.getProduct_name() + "\t"
															+ pd1.getProduct_id() + "\t" + pd1.getProduct_price());
												}

												break;

											case 3:
												System.out.println("Enter the Product id to Delete");
												int id2 = sc.nextInt();
												boolean count1 = false;
												int index = 0;
												for (Object obj : al1) {
													ProductDetails pd2 = (ProductDetails) obj;
													if (pd2.getProduct_id() == id2) {

														index = al1.indexOf(pd2);
														
														break;
													}
												}
												if (index != -1) {
													al1.remove(index);
													count1 = true;
													
												}

												if (count1)
													System.out.println("Delete Done...");
												else
													System.out.println("Delete Not Done...");

												break;

											}

										} while (true);

									} else {
										System.out.println("you Enter Wrond Details");
									}

								} else {

									System.out.println("Some Problem");
								}

								break;
							}
							case 2: {

								System.out.print("Set customerId,Set customerPassword:");
								int ci1 = sc.nextInt();
								String cp1 = sc.next();
								cl.setCid(ci1);
								cl.setCpass(cp1);
								;

								if (al.add(cl)) {
									System.out.println("Add Successfully....");

									System.out.print("Enter customer_Id,Set Customer_Password:");
									int u11 = sc.nextInt();
									String p11 = sc.next();
									boolean ct = false;

									for (int i = 0; i < al.size(); i++) {
										CustomerLogin cl1 = (CustomerLogin) al.get(i);
										if (cl1.getCid() == u11 && cl1.getCpass().equals(p11)) {
											ct = true;
											break;
										}
									}
									if (ct) {
										System.out.println("Login Sucessfully");
									} else {
										System.out.println("you Enter Wrond Details");
									}

								} else {

									System.out.println("Some Problem");
								}

								break;
							}
							}

						} while (true);

					}

				} while (true);

			}

		} while (true);

	}
}