from __future__ import annotations
import dataclasses
import dateutil.parser
from ..shared import projectrunstatus_enum as shared_projectrunstatus_enum
from dataclasses_json import Undefined, dataclass_json
from datetime import datetime
from marshmallow import fields
from sdk import utils


@dataclass_json(undefined=Undefined.EXCLUDE)
@dataclasses.dataclass
class ProjectStatusResponsePayload:
    r"""ProjectStatusResponsePayload
    Response format returned by the getRunStatus endpoint
    """
    
    elapsed_time: float = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('elapsedTime') }})
    end_time: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('endTime'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    project_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('projectId') }})
    project_version: int = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('projectVersion') }})
    run_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('runId') }})
    run_url: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('runUrl') }})
    start_time: datetime = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('startTime'), 'encoder': utils.datetimeisoformat(False), 'decoder': dateutil.parser.isoparse, 'mm_field': fields.DateTime(format='iso') }})
    status: shared_projectrunstatus_enum.ProjectRunStatusEnum = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('status') }})
    trace_id: str = dataclasses.field(metadata={'dataclasses_json': { 'letter_case': utils.field_name('traceId') }})
    