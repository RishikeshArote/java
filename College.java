class College
                  {
                    public static void main(String[] args)
                     {
                          Student s1=new Student();
                          Student s2= new Student();
                       
                          s1.sno=101;
         	          s1.sname="rishikesh";
                         s1.course="BE";
                         s1.fees=2500;

                         s2.sno=102;
                         s2.sname="shraddha";
                         s2.course="B.COM";
                         s2.fees=1000;

                            System.out.println("S1 VALUES ARE:");
                            System.out.println("s1.sno:" +s1.sno);
                            System.out.println("s1.sname:" +s1.sname);
                            System.out.println("s1.course:" +s1.course);
                            System.out.println("s1.fees:" +s1.fees);

                            System.out.println("S2 VALUES ARE:");
                            System.out.println("s2.sno:" +s2.sno);
                            System.out.println("s2.sname:" +s2.sname);
                            System.out.println("s2.course:" +s2.course);
                            System.out.println("s2.fees:" +s2.fees);
                         }
                     }

