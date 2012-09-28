package net.beaconhillcott.moodlerest.temporario;



import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.beaconhillcott.moodlerest.MoodleCallRestWebService;
import net.beaconhillcott.moodlerest.MoodleCourse;
import net.beaconhillcott.moodlerest.MoodleRestCourse;
import net.beaconhillcott.moodlerest.MoodleRestException;

/**
 *
 * @author root
 */
public class TestDeleteCourses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        	MoodleCallRestWebService.init("http://localhost:7070/moodle/webservice/rest/server.php", "d65f7f717b69f706873dcae6eef08ac7");
            MoodleCourse[] allCourses = MoodleRestCourse.getAllCourses();
            for (int i=0; i<allCourses.length; i++, System.out.println("************************************"))
                printCourseDetails(allCourses[i]);
             
            long [] courseids = new long[allCourses.length];
            for (int i = 0; i < allCourses.length; i++) {
				courseids[i] = allCourses[i].getId();
			}
            
            System.out.println(courseids);
            
           MoodleRestCourse.deleteCourses(courseids);
        } catch (MoodleRestException ex) {
            Logger.getLogger(TestDeleteCourses.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(TestDeleteCourses.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void printCourseDetails(MoodleCourse moodleCourse) {
        System.out.println("id                    ="+moodleCourse.getId());
        System.out.println("shortname             ="+moodleCourse.getShortname());
        System.out.println("category              ="+moodleCourse.getCategoryId());
        System.out.println("categorysortorder     ="+moodleCourse.getCategorySortOrder());
        System.out.println("fullname              ="+moodleCourse.getFullname());
        System.out.println("idnumber              ="+moodleCourse.getIdNumber());
        System.out.println("summary               ="+moodleCourse.getSummary());
        System.out.println("summaryformat         ="+moodleCourse.getSummaryFormat());
        System.out.println("format                ="+moodleCourse.getFormat());
        System.out.println("showgrades            ="+moodleCourse.getShowGrades());
        System.out.println("newsitems             ="+moodleCourse.getNewsItems());
        System.out.println("startdate             ="+moodleCourse.getStartDate());
        System.out.println("numsections           ="+moodleCourse.getNumSections());
        System.out.println("maxbytes              ="+moodleCourse.getMaxBytes());
        System.out.println("showreports           ="+moodleCourse.getShowReports());
        System.out.println("visible               ="+moodleCourse.getVisible());
        System.out.println("hiddensections        ="+moodleCourse.getHiddenSections());
        System.out.println("groupmode             ="+moodleCourse.getGroupMode());
        System.out.println("groupmodeforce        ="+moodleCourse.getGroupModeForce());
        System.out.println("defaultgroupingid     ="+moodleCourse.getDefaultGroupingId());
        System.out.println("timecreated           ="+moodleCourse.getTimeCreated());
        System.out.println("timemodified          ="+moodleCourse.getTimeModified());
        System.out.println("enablecompletion      ="+moodleCourse.getEnableCompletion());
        System.out.println("completionstartonenrol="+moodleCourse.getCompletionStartOnEnrol());
        System.out.println("completionnotify      ="+moodleCourse.getCompletionNotify());
        System.out.println("lang                  ="+moodleCourse.getLang());
        System.out.println("forcetheme            ="+moodleCourse.getForceTheme());
    }

}

