public class HanoiTower {
    public static void main(String[ ] args) {
        System.out.println( "Enter number of disks" );
//        int n = MyInput.readInt( );
        int n = 10;
        System.out.println( "The move are:");
        moveDISKs(n, 'A', 'B', 'C');
    }
    private static void moveDISKs(int n, char fromTower, char toTower, char auxTower) {
    if (n==1)
        System.out.println( "Move disk " + n + " from " + fromTower +" to " + toTower);
    else{
        moveDISKs(n-1, fromTower, auxTower, toTower);
        System.out.println( "Move disk " + n + " from " + fromTower + " to " + toTower );
        moveDISKs(n-1, auxTower, toTower, fromTower);
    }
    }
}

