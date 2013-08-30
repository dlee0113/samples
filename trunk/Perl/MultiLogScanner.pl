 #!/usr/bin/perl
use strict;
use warnings;

my $path = 'C:\Users\dlee2\Desktop\logs\VISTA\\';
my $totalCallsCount = 0;	# total number of calls
my $HIPAACount = 0; 		# total number of HIPAA validated calls
my $ANIHIPAACount = 0;		# total number of HIPAA validated calls with ANI data (no zipcode prompt)

opendir(DIR, $path);

while (my $filename = readdir(DIR)) {
	# Use a regular expression to ignore files beginning with a period
    next if ($filename =~ m/^\./);
	
	print $filename , "\n";
	open INPUT, $path.$filename;

	while (<INPUT>) {
		if (($_ =~ m/au_HIPAATransition/)) {	
			$HIPAACount ++;
		}
		if (($_ =~ m/au_ApplicationIsInOption_DS/) && ($_ !~ m/au_CollectZipCode/)) {
			$ANIHIPAACount ++;
		}
		
		$totalCallsCount ++;
	}

	close INPUT;
}

closedir DIR;

print $totalCallsCount, "\n";
print $HIPAACount, "\n";
print $ANIHIPAACount, "\n";

