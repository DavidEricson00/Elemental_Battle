
public class Display {
	
    public String[] getImage1(String type) {
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
        	} 
        return null;
    }
    
    public String[] getImage2(String type) {
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
        }
        return null;
    }
    
    public String[] getAttack(String type) {
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
        }
        return null;
    }

    
}