#!/bin/bash
#Filename: etherconnect.sh
#Description: Connect Ethernet

#Modify the parameters below according to your settings
######### PARAMETERS ###########

IFACE=eth0
IP_ADDR=192.168.0.5
SUBNET_MASK=255.255.255.0
GW=192.168.0.1
HW_ADDR=’00:1c:bf:87:25:d2’
# HW_ADDR is optional
#################################


if [ $UID -ne 0 ];
then
  echo "Run as root"
  exit 1
fi

# Turn the interface down before setting new config
/sbin/ifconfig $IFACE down


if [[ -n $HW_ADDR  ]];
then
  /sbin/ifconfig hw ether $HW_ADDR
 echo Spoofed MAC ADDRESS to $HW_ADDR

fi

/sbin/ifconfig $IFACE $IP_ADDR netmask $SUBNET_MASK

route add default gw $GW $IFACE

echo Successfully configured $IFACE

