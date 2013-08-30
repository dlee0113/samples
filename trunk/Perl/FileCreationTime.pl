#!/usr/bin/perl
use File::stat;
use Time::localtime;

$dir      = '/home/dlee0113/workspace/Perl/';
$filename = 'test.pl';

opendir( DIR, $dir ) or die $!;

while ( my $file = readdir(DIR) ) {
	# Use a regular expression to ignore files beginning with a period
	next if ( $file =~ m/^\./ );
	$date_string = ctime( stat($file)->mtime );
#	print "$file $date_string\n";
	printf("%-20s %-40s\n", $file, $date_string);
}

closedir(DIR);
