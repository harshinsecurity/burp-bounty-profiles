[{
  "enabled": true,
  "name": "Scan all requests with SSRF",
  "comments": "This rule scans all HTTP requests with all SSRF profiles. ",
  "scope": 0,
  "match_enabled": false,
  "operator": "",
  "profile_type": "",
  "passive_profile_type": "",
  "exec_enabled": false,
  "type": "",
  "active_profile_type": "",
  "match": [
    "true,,Passive Request,All_Requests_And_Parameters"
  ],
  "execute": [
    "true,Tag,SSRF,All Matches"
  ]
}]