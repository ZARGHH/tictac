private static void showBoard()
{
    for (int i=1; i< board.length;i=i+3)
    {
        System .out.println("|" board[i] + "|" + board[i+1] + "|" + board[i+2] + "|");
    }
}
private static char Select X or O()
{
    char player ='x';
    Scanner scan =new Scanner(System.in);
    while (true)
    {
        System .out.println("Select either X or O");
        player =scan.next().charAt(0);
        if (player =='X' || player == 'O')
        {
            return 'X';
        
        }
        else if ( player == O || player == 'O')
        {
        return 'O';
        }
    }
}