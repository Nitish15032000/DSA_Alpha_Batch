public class Shortedpath {
    public static void main(String[] args) {
        String str = "EWNSNNNSWWEEEEEEEEEEEE";
        float ans = path(str);
        System.out.println(ans);
    }

    static float path(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            switch(str.charAt(i)){
                case 'E':
                    x++;
                case 'W':
                    x--;
                case 'N':
                    y++;
                case 'S':
                    y--;
            }    
        }
        int y2 = y*y;
        int x2 = x*x;
        return (float)Math.sqrt(x2+y2);
    }   
}
