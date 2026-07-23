
class BirdWatcher {
    private final int[] birdsPerDay;
    
    static private final int[] 
    LAST_WEEK_COUNTS = {0,2,5,3,7,8,4};
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return LAST_WEEK_COUNTS;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int nBirds : birdsPerDay) {
            if (nBirds == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int cnt = 0;
        for(int i = 0; i < Math.min(birdsPerDay.length,numberOfDays); i++) {
            cnt += birdsPerDay[i];
        }
        return cnt;
    }

    public int getBusyDays() {
        int cnt = 0;
        for (int nBirds : birdsPerDay) {
            if(nBirds >= 5) cnt++;
        }
        return cnt;
    }
}
