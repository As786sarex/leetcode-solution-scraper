class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->a[1]-b[1]);
        PriorityQueue<Integer> q=new PriorityQueue<>((a,b)->b-a);
        int time=0,cnt=0;
        for(int i=0;i<courses.length;++i){
            if(courses[i][0]+time<=courses[i][1]){
                q.add(courses[i][0]);
                time+=courses[i][0];
                ++cnt;
            } else if(!q.isEmpty()&&q.peek()>courses[i][0]){
                time-=q.poll()-courses[i][0];
                q.add(courses[i][0]);
            }
        }
        return cnt;
    }
}

// Arrays.stream(courses).forEach(c->System.out.println(Arrays.toString(c)));
