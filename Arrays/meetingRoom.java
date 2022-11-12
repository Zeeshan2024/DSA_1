package Arrays;

import java.util.Arrays;

public class meetingRoom {
    public static void main(String[] args) {
    int[][] arr = { {0,20},
                    {5,10},
                    {10,15},
            {12,20},{50,60},{80,90},{2,7}
                    };
    int[][] pr = {{96426, 184393}, {169111, 865958}, {849900, 897733}, {262326, 518560}, {496256, 778443}, {349462,
            679585}, {471364, 893484}, {645977, 721551}, {648450, 906243}, {197078, 934232}, {58523, 953535}, {946939, 987568}
    };
        System.out.println(roomsReqired(pr));
    }

        public static int roomsReqired(int[][] arr){
            if(arr.length == 0){
                return 0;
            }
            Arrays.sort(arr,(a,b)->a[0]-b[0]);
            int start = arr[0][0];
            int end = arr[0][1];
            int room = 0;

            for(int[] i:arr){
                if(i[0]>=end){
                    end = Math.max(end,i[1]);
                }else{
                    end = Math.min(end,i[1]);
                    room++;}
            }
            return room;
        }

}
