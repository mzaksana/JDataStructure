#src dst
if((!exists $ARGV[0] && exists $ARGV[1])){

	print "Set source and destination\n";
	exit;
}
system "javac ".(join " ",split "\n",`find $ARGV[0] -name *.java`)." -d $ARGV[1]";

