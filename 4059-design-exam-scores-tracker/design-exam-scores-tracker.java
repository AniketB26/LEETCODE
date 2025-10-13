class ExamTracker {
    private ArrayList<Integer> times;
    private ArrayList<Long> prefix;
    public ExamTracker() {
        

            times = new ArrayList<>();
            prefix = new ArrayList<>();
        
    }
    
    public void record(int time, int score) {
        times.add(time);
        if(prefix.isEmpty()){
            prefix.add((long)score);
        }
        else{
            prefix.add(prefix.get(prefix.size() - 1) + score);
        }
    }
    
    public long totalScore(int startTime, int endTime) {
        int l = lower(times, startTime);
        int r = upper(times, endTime) - 1;

        if(l>r || l >= times.size() || r < 0) return 0;

        long res = prefix.get(r);

        if(l > 0){
            res -= prefix.get(l - 1);
        }

        return res;
    }

    int lower(List<Integer> time, int tar){
        int l = 0;
        int r = time.size() -1;

        while(l < r){
            int mid = (l+r)/2;

            if(time.get(mid) < tar){
                l = mid +1;
            }
            else{
                r = mid;
            }
        }

        return l;
    }

    int upper(List<Integer> time, int tar){
        int l = 0;
        int r = time.size();

        while(l < r){
            int mid = (l+r)/2;

            if(time.get(mid) <= tar){
                l = mid +1;
            }
            else{
                r = mid;
            }
        }

        return l;
    }
}

/**
 * Your ExamTracker object will be instantiated and called as such:
 * ExamTracker obj = new ExamTracker();
 * obj.record(time,score);
 * long param_2 = obj.totalScore(startTime,endTime);
 */