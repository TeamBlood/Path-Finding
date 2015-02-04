/* DungeonMain.java 
 * 
 * Class that can be used to test, execute, and implement 
 * implement a GUI in the game.
 * 
 * @author Wilton Latham
 * @version 0.08
 * @date 02-03-2015
 * 
 */
public class DungeonMain {
    
    /*
     * This is our main method that allows us to 
     * execute the game.
     */
    public static void main(String[] args)
    {
        //showSplashScreen();
		Dungeon marseille = new Dungeon();
		marseille.printTile(CornerSeeds.TLTILE);
		System.out.println();
		marseille.printBoard(marseille.getBoard());
	}


    /*
     * This method initializes a splash screen if called
     * prior to executing the game. 
     */
    public static void showSplashScreen()
    {
        System.out.println(";@#                              ;                                                          ,        ';                 @@`         ");                                                       
        System.out.println("@@@@@                           :@@                                                        +@@        @@@               ;@@@         ");                                                        
        System.out.println("#@@@@@@                         `@@@                                                        @@@       `@@@@              @@@@`        ");                                                        
        System.out.println("`@@@@@@@+                        `@@@                                                        @@@       @@@@@+            `@@@@.          ");                                                      
        System.out.println("@@`;@@@@#                        `@@#                                                        @@@       @@@@@@            +@@@@`              ");                                                  
        System.out.println(",@@  `@@@+                        `@@#                                                        @@@      '@@@@@@+           @:#@@                ");                                                 
        System.out.println("@@:    @@:                        `@@#                                                        @@@       @@@@@@@      @.   @``@@                  ");                                               
        System.out.println("@@      @.  @@+@@# .@:+@.` ,@ ;@, `@@##@     +@@@`  `@`+@,   @@@@@         ;@'`    ,@ @@    @@@@@        +@@@@#    `@@:  :@  @# `,@ @.. #@`  ,.  :@@@` +@@`@@  ;@`@@   ,@@@@:    ");               
        System.out.println("#@@          @@#@@;@@@,#@@:@@@`@@@ `@@#@@@   .@@@@  '@@#@@@  +@@@@@         @@@@#  @@@@@@+  @@@@@@         '@@@;    @@@'  #@ .@..@@@`@@@ @@@ ;@@  @@@@@ +@@+@@ @@@@@@;  @@@@@.   ");                
        System.out.println("@@@          @@@@@.@@@.@@@.@@@@@@@:`@@@@@@.  @@@@@# @@@@@@@  @@@@@@        @@@@@@  @@@@@@@ `@@@@@@          @@@.   .@@@+  @@ +@ .@@@:@@@ @@@ @@@ @@@@@@ +@@@@@`@@@@@@# @@@@@@     ");
        System.out.println("@@+          @@@@@ @@@`@@@`#@@@@@@#`@@@@@@+ ;@@#@@@ @@@#@@@`:@@, '#        @@@@@@: @@@:@@@ #@#'@@@          @@@    @@@@#  @@ @@ .@@@#@@# @@@ .@@ @@@#@@ +@@@@@`@@@+@@@ @@@ `@        ");            
        System.out.println(".@@'       '@ @@@#@ @@@.@@@ +@@#+@@#`@@@'@@# @@# @@@ #@@`@@@`+@@@'..       ,@@ @@@' @@@ @@@ @@# @@@          @@@   `@@@@@  @@ @. .@@#@@@+.@@@..@@ @@@`@@ #@@@## @@@.@@@ @@@@..`          ");         
        System.out.println(";@@'      @@@ @@@ : @@@#@@@ '@@.:@@#.@@#,@@@ @@' +@@`#@@`#@@`+@@@@@@#      '@@ +@@+ @@@ @@@ @@#;@@@          @@@   @@@@@@ ;@#:@  .@@@@@@' @@@';@@ @@# @@ #@@# , @@@ @@@ @@@@@@@              ");     
        System.out.println("+@@+      @@+ @@@   @@@@@@@ ;@@,.@@#.@@#`@@@`@@+ ;@@`#@@`+@@ ;@@@@@@@      #@@ @@@+ @@@ @@@ @@#@@@@          @@@   @'@@@@ @@;##  .@@@@@@; ,@@##@+ @@@@@@ #@@,   @@@ @@# @@@@@@@`                 "); 
        System.out.println("#@@@      @@. @@@   #@@@@@@ :@@,.@@:.@@# @@#`@@@ :@@ #@@`+@@  @@@@@@@      #@@.@@@+ @@@ @@@ @@@@@@@          @@#  @@ @@@@ @@`@`  `@@@@@@,  @@@@@  @@@@@  #@@:   @@@ @@+ @@@@@@@`                 "); 
        System.out.println("#@@@`    ,@@  @@@:  #@@'@@@ :@@@:@@ .@@# @@'`@@@ '@@ #@@`+@@  .@@@@@@      #@@@@@@+ @@@ @@# @@@@@@@          @@' `@# @@@@ @@`@   `@@@@@@.  @@@@,  @@@. @ #@@@.  @@@ @@'  #@@@@@                  "); 
        System.out.println("#@@@@, :@@@@  @@@@  #@@ @@@ :@@@@@@ ,@@+ @@: @@@@#@@ #@@`#@@  @`  @@#      +@@@.@@+ @@@ @@+ @@@,@@@          @@, @@  @@@@ @@;#   `@@;@@@`  @@@@   @@@@@@ +@@@#  @@@ @@; +:  ;@@                  "); 
        System.out.println("'@@@@@@@@@@@  @@@@  +@@ @@@ :@@@@@+ :@@+ @@, @@@@@@, #@@`@@@  @@@@@@`      '@@@`@@' @@@ @@' @@@ @@@          @@``@@  @@@@.@+@,    @@ @@@`  #@@#   @@@@@. ,@@@:  @@@`@@, @@@@@@@                  "); 
        System.out.println(".@@@@@@@@;@#  +@@#  '@  @@@ :@@@@@  :@@#`@@.  @@@@#  #@@`@@  .@@@@@@       :@@``@@# @@@`@@  @@, @@@          @@ @@`  @@@@@@`@     @# @@@   :@@,   ;@@@@   @@@   @@@,@+  @@@@@@`                  "); 
        System.out.println("@@@@@@@#,@;   '#.   #  @@@ ;@@# :  '## .@@    @@+   ##  @`   `@@@'        `@@ .@:  @; ,@   `@  @@#          @@`@@   @@@@@@ @     .. @@@   `#      #@@     ##   #. '#    #@@#                    "); 
        System.out.println("#@@@@@@ '@`        ;,  @@@ ;@@:        ,@.              .                             .                     @@@@;   @@@@@@;      @  @@@                           :                             "); 
        System.out.println("@@@@@` #@          @@@;@@' '@@`        ;'                                                                  `@@@@    @@@@@'      '@@;#@@                                                         "); 
        System.out.println("`@@@   @@         @@@@@@  +@@         `                                                                   `@@@#    +@@@@       @@@@@@#                                                         "); 
        System.out.println("`@@:             @@@@@@  #@@                                                                             .@@@`    .@@@`       #@@@@@                                                          "); 
        System.out.println("@@@            @@@@@;  #@@                                                                             .@@@      @@.        ,@@@@@                                                          "); 
        System.out.println(":@@:           @@@@   @@@                                                                             .@@'      @,          ;@@@,                                                          "); 
        System.out.println("#@#          .@;   .'@                                                                             ``        .             ,@                                         "); 
        System.out.println();   
    }
}
