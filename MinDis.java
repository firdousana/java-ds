public class MinDis {
    public static void main(String args[]){
        String words[]={"sana","madiha","afif","haji","raheela","sadia","neha"};
        String w1="afif";
        String w2="raheela";
        int dist=0;

        for(int i=0;i<words.length;i++){
            if(w1==words[i]){
                dist=dist+i;
            }
            if(w2==words[i]){
                dist=i-dist;
            }

        }
        System.out.println(dist);
    }
}
//i did a better and simlpe code comprd to other websites
