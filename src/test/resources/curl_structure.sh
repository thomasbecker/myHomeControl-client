curl -v --header "Content-Type: application/soap+xml; charset=utf-8;action=\"http://bootup.ch/getProjectStructure\"" --data @request.xml http://192.168.188.25:80/soap.asmx | xmllint --format -
