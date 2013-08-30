#!/usr/bin/perl

my $dir = 'C:\Documents and Settings\dlee2\Desktop\logs\VISTA\\';
my $filename = 'EIVR-SV_UCPWAS_P1-2011-02-21';

open INPUT, $dir . $filename;

while (<INPUT>) {	
	if ($_ =~ m/ANI=2026395900/) {
		print $_;
	}
}

close INPUT;
