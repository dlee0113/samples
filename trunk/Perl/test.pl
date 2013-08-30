	#!/usr/bin/perl
	use strict;
	use warnings;

	my $directory = 'C:\Documents and Settings\dlee2\Desktop\logs\VISTA\\';

my $path = 'C:\Documents and Settings\dlee2\Desktop\logs\VISTA\\';
opendir(DIR, $path);
my @FILES=readdir(DIR);
print @FILES;
closedir(DIR);