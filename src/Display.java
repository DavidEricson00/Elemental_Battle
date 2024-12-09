public class Display {
	
    public static String[] getImage1(String type) {
        if (type.equals("water")) {
            return new String[] {
                "    .-^-.          ",
                "   /     \\        ",
                "  /       \\       ",
                " /    .  . \\      ",
                "|       u   |      ",
                "\\          //     ",
                " `-._____.-'       ",
            };
        } else if (type.equals("fire")) {
        	return new String[] {
    			"   ,    /),        ",
    			"  (( -.((_))  _,)  ",
    			"  ,\\`.    `-','   ",
    			"  `.>        (,-   ",
    			" ,',    O  O  `._,)",
    			"((  )        (`--' ",
    			"`'( )._.._,-.\\    ",
	        };
        } else if (type.equals("nature")) {
        	return new String[] {
    			"    |              ",
    			"  .'|'.            ",
    			"// U|U \\          ",
    			" |  |_ |           ",
    			" \\_| //           ",
    			"  \\|//            ",
    			"                   ",
        	};
        } else if (type.equals("normal")) {
            return new String[] {
                "     o  o          ",
                "  o        o       ",
                " o      ._. o      ",
                " o          o      ",
                "  o        o       ",
                "     o  o          ",
                "                   ",
            };
        } return null;
    }
    
    public static String[] getImage2(String type) {
        if (type.equals("water")) {
            return new String[] {
                "         .-^-.     ",
                "        /     \\   ",
                "       /       \\  ",
                "      / .  .    \\ ",
                "     |   u       | ",
                "     \\          //",
                "      `-._____.-'  ",
            };
        } else if (type.equals("fire")) {
            return new String[] {
                "   ,    /),        ",
                "  (( -.((_))  _,)  ",
                " ,\\`.'    `-','   ",
                "  `.>        (,-   ",
                " ,', O  O     `._,)",
                "((  )        (`--' ",
                " `'( )._.._,-.\\   ",
            };
        } else if (type.equals("nature")) {
            return new String[] {
                "              |    ",
                "            .'|'.  ",
                "          // U|U \\",
                "           | _|  | ",
                "           \\ |_ //",
                "            \\|//  ",
                "                   ",
            };
        } else if (type.equals("normal")) {
            return new String[] {
                "           o  o    ",
                "        o        o ",
                "       o ._.      o",
                "       o          o",
                "        o        o ",
                "           o  o    ",
                "                   ",
            };
        } return null;
    }
    
    public static String[] getAttack(String type) {
        if (type.equals("water")) {
            return new String[] {
                "   ~  🌢  ~  🌢          ",
                "🌢    ~      🌢 ~        ",
                "~    🌢      🌢     ~    ",
                "~ 🌢  ~ 🌢        ~      ",
                "~      🌢   🌢    ~      ",
                "🌢    ~     🌢  ~        ",
                "~    🌢      🌢     ~    ",
            };
        } else if (type.equals("fire")) {
            return new String[] {
                "~     ~      ~  ~       ",
                "*    *   *    *  ~ ~    ",
                "*       ~       *       ",
                "*    *  ~ ~  *      *   ",
                "~     ~      ~  ~       ",
                "**     *   *            ",
                "*    *  ~ ~  *      *   ",
            };
        } else if (type.equals("nature")) {
            return new String[] {
                "   ) 🌿      🌿  (       ",
                "   🌿          *  (      ",
                "*       /      🌿   \\   ",
                ") 🌿      🌿  (          ",
                "  /      (    🌿 *       ",
                "*       /    🌿   \\   / ",
                "  ) 🌿        🌿  (      ",
            };
        } else if (type.equals("normal")) {
            return new String[] {
                "   O o      o O   O o     ",
                "   o O    0 o   O o   0   ",
                "0       O oo O     O o    ",
                "  O o      o O   0 o   O o",
                "  0 o   0 o    0 o     0 o",
                "0       o O     O o       ",
                "  O o        o O     0 o  ",
            };
        } return null;
    }

    public static  String[] Block() {
    	return new String[]{
			"           __            ",
			"          |  |           ",
			"          |  |           ",
			"          |  |           ",
			"          |  |           ",
			"          |  |           ",
			"          |__|           ",
		};
    }
    
    public static  String[] Empty() {
    	return new String[]{
			"                         ",
			"                         ",
			"                         ",
			"                         ",
			"                         ",
			"                         ",
			"                         ",
		};
    }
    
}