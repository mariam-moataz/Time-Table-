package oopproject;
import java.util.*;
public class OOPProject {
   
    Hour[] [] hrs ;
    
    OOPProject(){
    
        Schedule();
        showSchedule();
    
    }
    

    
    public void Schedule(){
    Courses [] crs = AllCoursesGUI.getAllcourses();
     hrs = new Hour[6][9];
        
        for ( int crscount=0; crscount<AllCoursesGUI.getNoc() ; crscount++ ) // all courses
        {
            for ( int i=0 ; i < crs[crscount].getNumOfLectures() ; i++) // all lectures of specific course
            {
                days:     for ( int j = 0 ; j < 6 ; j ++) // for 2d hrs array (Days)
                {
                  for( int k = 0 ; k < 9 ; k ++)// for 2d hrs array (Hours)
                    {

                      if(hrs[j][k] == null)
                        {
                          if( 9-(k+1)+1 >= crs[crscount].getLecs()[i].getNumOfHrs() )
                            {
                              for (int x = k ; x < k+crs[crscount].getLecs()[i].getNumOfHrs() ; x++){
                                  hrs[j][x] = new Hour();
                                  Period period = new Period();
                                  period.setCourse(crs[crscount]);
                                  period.setGeneralLL(crs[crscount].getLecs()[i]);
                                  hrs[j][x].getPeriods().add(period);
                                }
                              break days;
                            }
                        }

                      else
                        {
                            boolean overlap = false;
                            for (int arrlistcount=0; arrlistcount<hrs[j][k].getPeriods().size(); arrlistcount++) // all periods in hrs[j][k]
                            {

                              String Roomnameofpr= hrs[j][k].getPeriods().get(arrlistcount).getGeneralLL().getRoom().getName();
                              String Roomnameoflec=crs[crscount].getLecs()[i].getRoom().getName();
                              int Teacheridofpr = hrs[j][k].getPeriods().get(arrlistcount).getGeneralLL().getTech().getTeacherID();
                              int Teacheridoflec = crs[crscount].getLecs()[i].getTech().getTeacherID();

                              if(((Roomnameofpr).equals(Roomnameoflec)) || ( Teacheridofpr == Teacheridoflec))
                                {
                                    overlap = true;
                                    break;

                                }
                              
                            }
                          if (!overlap)
                          {
                                if( 9-(k+1)+1 >= crs[crscount].getLecs()[i].getNumOfHrs() )
                                {
                                           
                                    for (int x = k ; x < k+crs[crscount].getLecs()[i].getNumOfHrs() ; x++)
                                    {
                                        Period period = new Period();
                                        period.setCourse(crs[crscount]);
                                        period.setGeneralLL(crs[crscount].getLecs()[i]);
                                        hrs[j][x].getPeriods().add(period);
                                    }
                                    break days;
                                }
                            }
                          
                        }
                    }
                }
            }
            
            for ( int i=0 ; i < crs[crscount].getNumOfLabs() ; i++) // for all labs of specific course
            {
                days2: for ( int j = 0 ; j < 6 ; j ++)
                {
                  for( int k = 0 ; k < 9 ; k ++)
                    {

                      if(hrs[j][k] == null)
                        {
                          if( 9-(k+1)+1 >= crs[crscount].getLabs()[i].getNumOfHrs() )
                            {
                              for (int x = k ; x < k+crs[crscount].getLabs()[i].getNumOfHrs() ; x++){
                                  hrs[j][x] = new Hour();
                                  Period period = new Period();
                                  hrs[j][x].getPeriods().add(period);
                                  hrs[j][x].getPeriods().get(0).setCourse(crs[crscount]);
                                  hrs[j][x].getPeriods().get(0).setGeneralLL(crs[crscount].getLabs()[i]);
                                }
                               break days2;
                            }
                        }

                      else
                        {
                            boolean overlap = false;
                          for (int arrlistcount=0; arrlistcount<hrs[j][k].getPeriods().size(); arrlistcount++)
                            {

                              String Roomnameofpr= hrs[j][k].getPeriods().get(arrlistcount).getGeneralLL().getRoom().getName();
                              String Roomnameoflab=crs[crscount].getLabs()[i].getRoom().getName();
                              int Teacheridofpr = hrs[j][k].getPeriods().get(arrlistcount).getGeneralLL().getTech().getTeacherID();
                              int Teacheridoflab = crs[crscount].getLabs()[i].getTech().getTeacherID();

                              if(((Roomnameofpr).equals(Roomnameoflab)) || ( Teacheridofpr == Teacheridoflab))
                                {
                                    overlap = true;
                                    break;

                                }
                              
                            }
                          if (!overlap)
                          {
                                if( 9-(k+1)+1 >= crs[crscount].getLabs()[i].getNumOfHrs() )
                                {
                                           
                                    for (int x = k ; x < k+crs[crscount].getLabs()[i].getNumOfHrs() ; x++)
                                    {
                                        Period period = new Period();
                                        hrs[j][x].getPeriods().add(period);
                                        int index = hrs[j][x].getPeriods().size();
                                        hrs[j][x].getPeriods().get(index-1).setCourse(crs[crscount]);
                                        hrs[j][x].getPeriods().get(index-1).setGeneralLL(crs[crscount].getLabs()[i]);
                                    }
                                     break days2;
                                }
                            }
                        }
                    }
                }
            }
            
        }

    }
    
    public void showSchedule(){
        
        for ( int j = 0 ; j < 6 ; j ++)
        {
            System.out.printf("Day #%d:\n",j+1);
            for( int k = 0 ; k < 9 ; k ++)
            {
                System.out.printf("Hour #%d:\n",k+1);
                if(hrs[j][k]!= null)
                {
                    
                    for(int x = 0 ; x < hrs[j][k].getPeriods().size() ; x++)
                    {
                        
                        System.out.printf("Period #%d:\n",x+1);
                        System.out.printf("Course Id  :\n");
                        System.out.print(hrs[j][k].getPeriods().get(x).getCourse().getId()+"\n");
                        System.out.printf("Course Name :\n");
                        System.out.print(hrs[j][k].getPeriods().get(x).getCourse().getName()+"\n");
                        
                        if(hrs[j][k].getPeriods().get(x).getGeneralLL() instanceof Lecture)
                        {
                            System.out.printf("Lecture :\n");
                            System.out.printf("Lecture Number Of Hours :\n");
                            System.out.print(hrs[j][k].getPeriods().get(x).getGeneralLL().getNumOfHrs()+"\n");
                            System.out.printf("Lecture Professor ID :\n");
                            System.out.print(hrs[j][k].getPeriods().get(x).getGeneralLL().getTech().getTeacherID()+"\n");
                            System.out.printf("Lecture Professor Name :\n");
                            System.out.print(hrs[j][k].getPeriods().get(x).getGeneralLL().getTech().getName()+"\n");
                            System.out.printf("Lecture ClassRoom Name :\n");
                            System.out.print(hrs[j][k].getPeriods().get(x).getGeneralLL().getRoom().getName()+"\n");
                        }
                        
                        else
                        {
                            System.out.printf("Lab :\n");
                            System.out.printf("Lab Number Of Hours :\n");
                            System.out.print(hrs[j][k].getPeriods().get(x).getGeneralLL().getNumOfHrs()+"\n");
                             System.out.printf("Lab TA ID :\n");
                            System.out.print(hrs[j][k].getPeriods().get(x).getGeneralLL().getTech().getTeacherID()+"\n");
                            System.out.printf("Lab TA Name :\n");
                            System.out.print(hrs[j][k].getPeriods().get(x).getGeneralLL().getTech().getName()+"\n");
                            System.out.printf("Lab Laboratory Name :\n");
                            System.out.print(hrs[j][k].getPeriods().get(x).getGeneralLL().getRoom().getName()+"\n");
                        }
                        System.out.print("\n");
                    }
                    
                }

            }
            
            System.out.print("\n\n");

        }
        
    }
    
}
