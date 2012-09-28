
package net.beaconhillcott.moodlerest;

/**
 *
 * @author Bill Antonia
 */
public class MoodleRestCourseException extends MoodleRestException {

    /**
     *
     */
    public static final String NO_LEGACY_CALL="No legacy call";
    
    /**
    *
    */
   public static final String INVALID_COURSEID="Bad course id";
    
    MoodleRestCourseException() {}

    MoodleRestCourseException(String msg) {
        super(msg);
    }
}
