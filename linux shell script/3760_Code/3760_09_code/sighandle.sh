#/bin/bash
#Filename: sighandle.sh
#Description: Signal handler 

function handler()
{
	echo Hey, received signal : SIGINT
}

echo My process ID is $$
# $$ is a special variable that returns process ID of current process/script
trap 'handler' SIGINT
#handler is the name of the signal handler function for SIGINT signal

while true;
do
	sleep 1
done

